<template>
  <div id="list">
  	<ul style="padding-left: 0px">
  		<li v-for="item in hrs" :class="{ active: currentSession ? item.username === currentSession.username : false}"
			v-on:click="changeCurrentSession(item)">
  			<img class="avatar" :src="item.userFace" :alt="item.name">
  			<el-badge :is-dot="isDot[user.username + '#' + item.username]"><p class="name">{{item.name}}<span style="font-size: 4px">{{item.isOnline == 'true' ? '[在线]' : '[离线]'}} </span></p></el-badge>
  		</li>
  	</ul>
  </div>
</template>

<script>
import {mapState} from 'vuex'

export default {
  name: 'List',
  data () {
    return {
		user: JSON.parse(window.sessionStorage.getItem("user"))
    }
  },
  computed: mapState([
	  'hrs',
	  'currentSession',
	  'isDot'
	]),
  methods:{
  	changeCurrentSession(currentSession) {
  		this.$store.commit('changeCurrentSession',currentSession)
  	}
  }
}
</script>

<style lang="scss" scoped>
#list {
	li {
		padding: 14px 15px;
		border-bottom: 1px solid #292C33;
		cursor: pointer;
		list-style: none;
		&:hover {
			background-color: rgba(255, 255, 255, 0.03);
		}
	}
  li.active {/*注意这个是.不是冒号:*/
			background-color: rgba(255, 255, 255, 0.1);
	}
	.avatar {
		border-radius: 2px;
		width: 30px;
		height: 30px;
		vertical-align: middle;
	}
	.name {
		display: inline-block;
		margin-left: 15px;
		margin-top: 0px;
		margin-bottom: 0px;
	}
}
</style>
