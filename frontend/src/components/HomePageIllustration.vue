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
  <section class="bg-amber-50 py-20 mb-4">
    <div class="relative max-w-7xl mx-auto px-4 sm:px-6 lg:px-8">
      <!-- Image de fond floutée -->
      <div class="absolute inset-0 bg-[url('/images/bg-homepage.jpg')] bg-cover bg-center filter blur-xs z-0"></div>
      
      <!-- Contenu (texte) au-dessus de l'image -->
      <div class="relative z-10 text-center">
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