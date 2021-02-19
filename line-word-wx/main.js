import Vue from 'vue'
import App from './App'

Vue.config.productionTip = false

App.mpType = 'app'

let baseUrl = "http://127.0.0.1:8080/line-work"

Vue.prototype.url = {
	register: baseUrl + "/tbUser/register",
}

Vue.prototype.ajax = function(url, method, data, fun) {
	uni.request({
		"url": url,
		"method": method,
		"header": {
			token: uni.getStorageSync('token')
		},
		"data": data,
		success: function(resp) {
			if (resp.statusCode == 401) {
				uni.redirectTo({
					url: '../login/login'
				});
			} else if (resp.statusCode == 200 && resp.data.code == 200) {
				let data = resp.data
				if (data.hasOwnProperty("token")) {
					console.log(resp.data)
					let token = data.token
					uni.setStorageSync("token", token)
				}
				fun(resp)
			} else {
				uni.showToast({
					icon: 'none',
					title: resp.data
				});
			}
		}
	});
}

const app = new Vue({
	...App
})
app.$mount()
