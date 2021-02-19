 <template>
	<view >
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
				toRegister(){
					/* console.log('测试一下') */
					uni.navigateTo({
						url: '../register/register'
					})
				}
			};
		}
	}
</script>

<style lang="less">
@import url("login.less");
	
</style>
