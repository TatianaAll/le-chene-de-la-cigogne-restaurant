<script setup>
defineProps({
  title: {
    type: String,
    default: "Le chêne de la cigogne"
  },
  subtitle: {
    type: String,
    default: "Le meilleur restaurant de tartes flambées"
  }
});
</script>

<template>
  <section class="bg-amber-50 py-5 mb-2">
    <div class="bg-[url('/images/bg-homepage.jpg')] bg-contain bg-no-repeat bg-center w-full h-screen">
      <div class="text-center mx-auto max-w-1/2 py-4 backdrop-blur-xs">
        <h1 class="text-4xl font-extrabold text-amber-950 sm:text-5xl md:text-6xl">
          {{ title }}
        </h1>
        <p class="my-4 text-xl text-amber-700">
          {{ subtitle }}
        </p>
      </div>
    </div>
  </section>
</template>