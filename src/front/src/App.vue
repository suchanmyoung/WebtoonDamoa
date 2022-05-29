<template>
  <div class="menu">
    <a v-for="(menu, i) in menus" :key="i">{{menu}}</a>
  </div>


  <transition name="fade">
    <Modal :products="products" :isModalOpen="isModalOpen" :onpress="onpress"
    @closeModal="isModalOpen=false"/>
  </transition>

  <Discount/>

  <Card @openModal="isModalOpen = true; onpress = $event"
  :products="products[i]"
  v-for="(product, i) in products" :key="product"/>
</template>

<script>

import Discount from './Discount.vue';
import Modal from './Modal.vue';
import onerooms from './oneroom';
import Card from './Card.vue';

export default {
  name: 'App',
   data(){
     return {
       onpress : 0,
       isModalOpen : false,
       신고수 : [0, 0, 0],
       menus : ['Home', 'Product', 'About'],
       products : onerooms,
     }
   },

methods : {
  increase(i){
    this.신고수[i]++;
  }
},

   components:{
      Modal : Modal,
      Discount : Discount,
      Card : Card,
   }
}
</script>

<style>
body {
  margin : 0
}

div {
  box-sizing: border-box;
}

#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

.menu{
  background: darkslateblue;
  padding: 15px;
  border-radius: 5px;
}

.menu a {
  padding: 10px;
  color : white
}

.fade-enter-from{
  transform: translateY(-1000px);
}

.fade-enter-active{
  transition: all 1s;
}

.fade-enter-to{
  transform: translateY(0px);
}

.fade-leave-from{
  opacity: 1;
}

.fade-leave-active{
  transition: all 1s;
}

.fade-leave-to{
  opacity: 0;
}
</style>
