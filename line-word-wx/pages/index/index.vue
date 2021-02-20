<template>
	<view>
		<view class="page">
			<swiper circular="true" duration="1000" interval="8000" class="swiper">
				<swiper-item>
					<image mode="widthFix" src="https://thumbimage.tantupix.com/u/690019/202004260906019aOWnUJ6jlL1l.jpg-h500"></image>
				</swiper-item>
				<swiper-item>
					<image mode="widthFix" src="https://thumbimage.tantupix.com/u/698106/20191211180315Noq95Zo4yRya3.jpg-h500"></image>
				</swiper-item>
				<!-- https://thumbimage.tantupix.com/u/698106/20191211180315Noq95Zo4yRya3.jpg-h500 -->
				<!-- 	<swiper-item>
				<image mode="widthFix" src="URL地址"></image>
			</swiper-item>
			<swiper-item>
				<image mode="widthFix" src="URL地址"></image>
			</swiper-item>
			<swiper-item>
				<image mode="widthFix" src="URL地址"></image>
			</swiper-item>
			<swiper-item>
				<image mode="widthFix" src="URL地址"></image>
			</swiper-item> -->
			</swiper>
		</view>
		<view class="news">
			<van-cell value="查看详情" icon="bell" is-link>
				<view slot="title">
					<view class="van-cell-text">消息提醒</view>
					<van-tag type="danger">您有23条未读消息</van-tag>
				</view>
			</van-cell>
		</view>
		<view class="nav-container">
			<view class="nav-row">
				<view class="nav">
					<image src="../../static/nav-1.png" mode="widthFix" class="icon"></image>
					<text class="name">在线签到</text>
				</view>
				<view class="nav">
					<image src="../../static/nav-2.png" mode="widthFix" class="icon"></image>
					<text class="name">员工健康</text>
				</view>
				<view class="nav">
					<image src="../../static/nav-3.png" mode="widthFix" class="icon"></image>
					<text class="name">在线请假</text>
				</view>
				<view class="nav">
					<image src="../../static/nav-4.png" mode="widthFix" class="icon"></image>
					<text class="name">公务出差</text>
				</view>
			</view>
			<view class="nav-row">
				<view class="nav">
					<image src="../../static/nav-5.png" mode="widthFix" class="icon"></image>
					<text class="name">员工日报</text>
				</view>
				<view class="nav">
					<image src="../../static/nav-6.png" mode="widthFix" class="icon"></image>
					<text class="name">我的加班</text>
				</view>
				<view class="nav">
					<image src="../../static/nav-7.png" mode="widthFix" class="icon"></image>
					<text class="name">付款申请</text>
				</view>
				<view class="nav">
					<image src="../../static/nav-8.png" mode="widthFix" class="icon"></image>
					<text class="name">费用报销</text>
				</view>
			</view>
			<view class="nav-row">
				<view class="nav">
					<image src="../../static/nav-9.png" mode="widthFix" class="icon"></image>
					<text class="name">公告通知</text>
				</view>
				<view class="nav">
					<image src="../../static/nav-10.png" mode="widthFix" class="icon"></image>
					<text class="name">在线审批</text>
				</view>
				<view class="nav">
					<image src="../../static/nav-11.png" mode="widthFix" class="icon"></image>
					<text class="name">物品领用</text>
				</view>
				<view class="nav">
					<image src="../../static/nav-12.png" mode="widthFix" class="icon"></image>
					<text class="name">采购申请</text>
				</view>
			</view>
		</view>
	</view>
</template>

<script>
	export default {
		data() {
			return {
				title: 'Hello'
			}
		},
		onLoad() {

		},
		methods: {

		}
	}
</script>

<style lang="less">
	@import url("../../style.less");

	.page {
		background-color: #EEEEF4;
	}

	.swiper {
		height: 200px;

		image {
			width: 100% !important;
		}
	}

	.news {
		margin: 20rpx 0px;
	}

	.news .van-icon-bell,
	.van-cell-text {
		color: #88a2f6;
	}

	.nav-container {
		background-color: #fff;
		margin-bottom: 20rpx;
		padding: 50rpx 40rpx;

		.nav-row {
			display: flex;
			justify-content: space-between;
			margin-bottom: 50rpx;

			.nav {
				text-align: center;

				.icon {
					width: 80rpx;
				}

				.name {
					display: block;
					font-size: 30rpx;
					color: @font-color;
				}
			}
		}
	}
</style>
