<script setup>
import { RouterLink, useRoute } from 'vue-router';
import logo from '@/assets/logo-chenecigogne.png';

const isActiveLink = (routePath) => {
  const route = useRoute();
  return route.path === routePath;
};
</script>

<template>
  <nav class="bg-amber-50 border-b border-orange-100">
    <div class="mx-auto max-w-7xl px-2 sm:px-6 lg:px-8">
      <div class="flex h-20 items-center justify-between">
        <div class="flex flex-1 items-center justify-between md:items-stretch md:justify-start">
          <RouterLink class="flex flex-shrink-0 items-center mr-4" to="/">
            <img class="h-12 w-auto" :src="logo" alt="Logo restaurant" />
            <span class="hidden md:block text-amber-950 text-2xl font-bold ml-2">Restaurant le chêne de la cigogne</span>
          </RouterLink>
          <div class="md:ml-auto">
            <div class="flex space-x-2">
              <RouterLink to="/"
                :class="[isActiveLink('/') ? 'bg-amber-700 text-amber-50' : 'hover:bg-orange-900  hover:text-amber-50 text-amber-950', 'px-3', 'py-2', 'rounded-md']">
                Accueil</RouterLink>
              <RouterLink to="/menu"
                :class="[isActiveLink('/menu') ? 'bg-amber-700 text-amber-50' : 'hover:bg-orange-900 hover:text-amber-50 text-amber-950', 'px-3', 'py-2', 'rounded-md']">
                La carte
              </RouterLink>
              <RouterLink to="/"
                :class="[isActiveLink('/reservation') ? 'bg-amber-700 text-amber-50' : 'hover:bg-orange-900 hover:text-amber-50 text-amber-950', 'px-3', 'py-2', 'rounded-md']">
                Réserver </RouterLink>
            </div>
          </div>
        </div>
      </div>
    </div>
  </nav>
</template>