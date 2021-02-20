<template>
	<view>
		<view class="box-view">
			<image src="../../static/602f45c4a4d7b.png" mode="widthFix" class="logo"></image>
			<view class="logo-title">Line-Work在线办公系统</view>
		</view>
		<button class="login-btn" open-type="getUserInfo" @tap="login()">登录系统</button>
		<view class="register-container">
			<text>没有账号？</text>
			<text class="register" @tap="toRegister()">立即注册</text>
		</view>
	</view>
</template>

<script>
	export default {
		data() {
			return {
				toRegister() {
					/* console.log('测试一下') */
					uni.navigateTo({
						url: '../register/register'
					})
				},
				login() {
					let that = this;
					uni.login({
						provider: 'weixin',
						success: (resp) => {
							let code = resp.code;
							that.ajax(that.url.login, "POST", {
								"code": code
							}, (resp) => {
								let permission = resp.data.permission;
								uni.setStorageSync('permission', permission);
								uni.switchTab({
								    url: "../index/index"
								});
							})
						},
						fail: function(e) {
							console.log(e)
							uni.showToast({
								icon: "none",
								title: "执行异常"
							})
						}
					})
				}
			};
		}
	}
</script>

<style lang="less">
	@import url("login.less");
</style>
