<template>
  <div>
    <img :src="products.image" class="room-img">
    <h4 @click="$emit('openModal', products.id)">{{products.title}}</h4>
    <p>{{products.price}}$</p>
  </div>
</template>

<script>
export default {
  name : 'Card',
  props : {
    products : Object,
  }
}
</script>

<style>
.room-img {
  width : 100%;
  margin-top: 40px;
}
</style>