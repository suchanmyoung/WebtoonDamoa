<template>
  <div class="black-bg" v-if="isModalOpen == true">
    <div class="white-bg">
      <img :src="products[onpress].image">
      <h4>{{products[onpress].title}}</h4>
      <p>{{products[onpress].content}}</p>
      구매 : <input v-model.number="month" type="text" placeholder="개월">
      <select v-model.number="month">
        <option>6</option>
        <option>12</option>
        <option>24</option>
      </select>
      <p>{{month}} 개월 선택 : {{products[onpress].price * month}}</p>
      <button @click="$emit('closeModal')">닫기</button>
    </div>
  </div>
</template>


<script>

export default {
  name : 'Modal',
  data(){
    return {
      month : 1,
    }
  },
  watch : {
    month(month){
      if(isNaN(month)) {
        alert('문자 입력하지마셈');
        this.month = 1;
      }
    }
  },
  props : {
    products : Array,
    isModalOpen : Boolean,
    onpress : Number,
  }
}
</script>

<style>
.black-bg {
  width: 100%; height: 100%;
  background: rgba(0, 0, 0, 0.5);
  position: fixed; padding: 20px;
}

.white-bg {
  width: 100%; background: white;
  border-radius: 8px;
  padding: 20px;
}
</style>