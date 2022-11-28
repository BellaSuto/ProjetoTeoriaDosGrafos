# Trabalho Final da disciplina Teoria dos Grafos


## 📌Problema dos conspiradores políticos
### Descrição:

Os agentes A, B, C, D, E, F, G e H são conspiradores políticos. De forma a coordenar seus esforços,
é vital que cada agente seja capaz de comunicar-se direta ou indiretamente com todos os outros
conspiradores. Esta comunicação, contudo, envolve um certo risco para cada um. Os fatores de
risco associados à comunicação direta entre cada par de conspiradores é dado por:

<center><img src="https://lh3.googleusercontent.com/bg05IPq8ax8aQKWBf0gwrU5qcYeZ8VN6hemQIjHih_XRBKPkDw37bNU-cJZBxW_pF6Y-3AlehQBXsn5Sv7rCYt0FkqIhpOKcbOWleGBj9IMBnQnbStVxzZrW3W-hfyYtxxfQynjsUGouNhKJRMPEisJUDrImVpCp6bXgcJoLsTUDuaW8J6_9QSRr9wFIaq4ETSZaaiUwOJea-qad-7_D8Emocl9Sp3VXRrABAlNjrYlYj9FuJSkfzbbSjod-PJ4_axnjxFWlYOrHj6OWzmDpVlsQPTSO_p5OOn-9Sbzgoeoid0rt2N269Sxum2E7W9UecTwR6Iwa5KtvHKkoVdir7MKW4AlgZRmpbX5C0iyb1EvTxg88E4rOoO8FulS2iUpGAA4qWZDKcEVV__qOJ5IWm49F3xMr8qvSp_nE2jB8U1i36lvQF-gRqNVS7W0MsrEHCO4LGu65C02qqRVRhqHSN2Pd0zQz4BPBtytotCUn2eXRqLVVlqViw2NBAMUyzmM9IvJeGs-8YK3uKpDMul2xBu1BXCBxkIPrXnIXPxkMAUpi_pe3UfEcv1mzmHPFJuoJXjb8YZpyKwRkkYWqUvvm3p5iwxbKLR4drZLaPak225vK2zUsnskj-JW2oyMZaEIZjCVKBKqVX-GeG-wrrsQQKimEHkxwL_eSLG3XArwj079pYegoMi7HLUyYYKCpWNsq1jwiIRZV1dW52wjHEpjH6ah7KoB1JRNOSOtfkLtnEHuUmPiNCtHLYw4sux3Inpx8OiQfPDL2oeQANCmNQnPb2DJ4oT5JEs6B1sCsS9mGcRfRVEFP5PaUkrijQYRbGrtx8u6wtsXWeU5CERn92rxUMTYCY9rM-8txJ0MwI-hl8uK7FmSoBXHtVnnw7GW8oIFj9QBI8HS-2rQyGuUmkLXqHFpamXqr_WQXb7GEAlQvR24kiHZLTe-bT6iAJRkEj4NvkxZeV5bECpFLyrXV43pR=w340-h102-no?authuser=0"></center>


Todas as outras comunicações diretas são impraticáveis pois exporiam todos os esquema de
disfarce. Qual é o menor risco total envolvido neste sistema de conexão, ou seja, o menor risco para
que uma mensagem seja repassada para todos os conspiradores?O calculo foi realizado com base na técnica de ordenação topológica utilizando o algoritmo de kahn.

### Resultado

```
O menor risco para que uma mensagem seja repassada para todos os conspiradores:
[A, C, F, G, D, H, E, B]

Risco= 30

```
## ✔️ Técnicas e tecnologias utilizadas

- ``Java 16``
- ``InteliJ IDEA``
- ``Algoritmo de Prim``
