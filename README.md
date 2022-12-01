# Trabalho Final da disciplina Teoria dos Grafos


## 📌Problema dos conspiradores políticos
### Descrição:

Os agentes A, B, C, D, E, F, G e H são conspiradores políticos. De forma a coordenar seus esforços,
é vital que cada agente seja capaz de comunicar-se direta ou indiretamente com todos os outros
conspiradores. Esta comunicação, contudo, envolve um certo risco para cada um. Os fatores de
risco associados à comunicação direta entre cada par de conspiradores é dado por:

<center><img src="https://lh3.googleusercontent.com/L_O6QYSLn-TkBtn4kTImQOg5XshGPcWaJI4S-E1I_VdfHe4VWQ8aQ-tpN33rCsmzJOPsqiMsDdF9L0gZgfJB9NF2Kr622rfR-4RbJ_FFpRiPoMvT8fEaYbjye7NE2qdupYSejfHbIvSHJLlMa5uum1hsqvB0yyMQxJ5-nKqhUBptGR3j_h5vq7kb8eIrcWz7cb6pQTemTKHM_-dGz-ugrrtLQcHEr14SZkiiry9P6LwlU2fcMyG5S0ZnQduxmHieKSTKoK8AOq7yGffJC4fw7RoHlEKWusEmmS6vdp1Mk_de21U6SEkHCk7reZZAJtC5UJCJSIh962ScR5lawAMwtgo09XCZ4ZgoEn-1-lO_BiFOSUS6fyWJHVq2BwDXNTISxs93SNwuqnnsGDPHFoY-xJm3XyjuhzY1B5ApYL6dyWm7b08iwbbM-DhoZ9rlVZzdpGz245qv9s8gvVOvrsTD7YjgkWZv7YtJF--fo4qWeOTGTu7WPT0AyhF8fzc06jKdxW7HUSV3GXfRkXJ4dltW8O8TNSSwV7Qo6GQeT_6myWZwLNwfP5PQ_JX4lUQgcyA3i80eDYCdnAeN2_aXhGvX59-enfeBBmvnF_VNY8Cnzg8IaBtYcH7o5l0C3k7N2v5l7Ef5fHH9CStg4cGif8uSWebWadPGe04EC4VSrc0_GBwrT1dUmHyiFV3Xzt3E9unORJaqy_DJnBNemmALoTlQhAGzN-Eb-GlLD85CUkQwYljUKg_AzUz23mGzAWhtZ_B2GdlHZtxY6IvtvXb1F3J_MNTIVvuVk1ykcGTJm6j2da4dTLQWA3XbA1qO4vqq5u8jabVlP-Okw9JzgPfwEUuaxdXK6DTzM436UIxHQ39eM189NPv3ySycHM-ZjdFwFOPVYDL206cIjR22tOGlNEsS-RzntN0cxdOUNpJmSysNTZijVYGR6HWaBwHt6O7Cc973UyxiptwTuFgaLK4gqYBn=w340-h102-no?authuser=0"></center>


Todas as outras comunicações diretas são impraticáveis pois exporiam todos os esquema de
disfarce. Qual é o menor risco total envolvido neste sistema de conexão, ou seja, o menor risco para
que uma mensagem seja repassada para todos os conspiradores?

### Resultado

```
O menor risco para que uma mensagem seja repassada para todos os conspiradores:
[A, C, F, G, D, H, E, B]

Risco= 30

```
## ✔️ Algoritmo e tecnologias utilizadas

- ``Java 16``
- ``InteliJ IDEA``
- ``Algoritmo de Prim``
