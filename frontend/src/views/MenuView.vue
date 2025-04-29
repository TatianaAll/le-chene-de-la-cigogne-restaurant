<script setup>
import MenuDishes from '@/components/MenuDishes.vue';
import { onMounted } from 'vue';

defineProps({
  startDate: {
    type: String,
    default: "10 septembre"
  },
  endDate: {
    type: String,
    default: "1er novembre"
  }
});

onMounted(async () => {
  try {
    const response = await axios.get("/api/menu");
    dish.value = response.data;
  } catch (error) {
    console.error("error fetching menu's dishes", error);
  }
});
</script>

<template>
  <section>
    <h1>Le menu de la saison</h1>
    <h2>Du {{ startDate }} au {{ endDate }}</h2>

    <div class="bg-red-50">
      <MenuDishes/>
    </div>
  </section>
</template>