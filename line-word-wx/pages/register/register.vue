<template>
	<view>
		<image src="../../static/602f454b9ee6e.png" mode="widthFix" class="logo"></image>
		<view class="register-container">
			<input placeholder="输入你的邀请码" class="register-code" maxlength="6" v-model="registerCode" />
			<view class="register-desc">管理员创建员工证账号之后，你可以从你的个人邮箱中获得注册邀请码</view>
			<button class="register-btn" open-type="getUserInfo" @tap="register()">注册</button>
		</view>
	</view>
</template>

<script>
	export default {
		data() {
			return {
				registerCode: null
			};
		},
		methods: {
			register() {
				let that = this;
				if (that.registerCode == null || that.registerCode.length == 0) {
					uni.showToast({
						title: '邀请码不能为空',
						icon: 'none'
					});
					return;
				} else if (/^[0-9]{6}$/.test(that.registerCode) == false) {
					uni.showToast({
						title: '邀请码必须是6为数字',
						icon: 'none'
					});
					return;
				}
				uni.login({
					provider: 'weixin',
					success: (resp) => {
						console.log(resp)
						let code = resp.code;
						uni.getUserInfo({
							provider: 'weixin',
							success: (resp1) => {
								let nickName = resp1.userInfo.nickName;
								let avatarUrl = resp1.userInfo.avatarUrl;
								let data = {
									code: code,
									nickName: nickName,
									photo: avatarUrl,
									registerCode: that.registerCode
								};
								that.ajax(that.url.register, 'POST', data, function(resp) {
									let permission = resp.data.permission;
									uni.setStorageSync('permission', permission);
									//跳转到index页面
									uni.showToast({
										title: '绑定成功'
									});
									setTimeout(() => {
										uni.navigateTo({
											url: '../login/login'
										})
									},1000)

								});
							}
						})
					}
				})

			}
		}
	}
</script>

<style lang="less">
	@import url("../../style.less");

	.logo {
		width: 60%;
		display: block;
		margin-left: auto;
		margin-right: auto;
		margin-top: 80rpx;
	}

	.register-container {
		width: 70%;
		margin-top: 150rpx;
		margin-left: auto;
		margin-right: auto;

		.register-code {
			border: solid 1rpx #e0e0e0;
			font-size: 34rpx;
			color: @font-color;
			height: 80rpx;
			padding: 0 20rpx;
			text-align: center;
			margin-bottom: 30rpx;
			background-color: #f5f5f5;
			border-radius: 10rpx;
		}

		.register-desc {
			color: @desc-color;
			font-size: 28rpx;
			line-height: 1.5;
			margin-bottom: 80rpx;
		}

		.register-btn {
			background-color: @background-color;
			color: #fff;
		}
	}
</style>
