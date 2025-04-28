<script setup>
import { RouterLink, RouterView } from 'vue-router';
import Navbar from '@/components/Navbar.vue';
</script>

<style>
.font-bricolage {
  font-family: "Bricolage Grotesque", sans-serif;
}
</style>

<template>
  <div class="font-bricolage">
    <header>
      <Navbar />
    </header>
    <main>
      <RouterView />
    </main>
  </div>
</template>
