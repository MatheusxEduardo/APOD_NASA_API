# 🌌 APOD_NASA_API

Projeto que consome a API [Astronomy Picture of the Day (APOD)](https://api.nasa.gov/) da NASA para exibir imagens astronômicas diárias com suas respectivas descrições.

## 📸 Sobre o Projeto

Este projeto foi desenvolvido como parte dos meus estudos em programação e integração com APIs públicas. Ele faz requisições HTTP para a API APOD da NASA, obtendo dados como:

✨ Título da imagem  
📅 Data da imagem  
🖼️ URL da imagem em alta resolução  
🧠 Explicação detalhada sobre o conteúdo astronômico

Tudo isso é apresentado de forma simples para facilitar o consumo das informações.

## 🚀 Tecnologias Utilizadas

- ☕ Java
- 🌐 HTML (para exibição básica)
- 🔭 [NASA APOD API](https://api.nasa.gov/)
- 📦 Bibliotecas Java para requisições HTTP (por exemplo: `HttpURLConnection`, `Gson`, etc.)

## 🛠️ Como Executar

1. Clone o repositório:

   ```bash
   git clone https://github.com/MatheusxEduardo/APOD_NASA_API.git
   cd APOD_NASA_API
   ```

2. Obtenha uma chave de API gratuita em: [api.nasa.gov](https://api.nasa.gov/)

3. Insira sua chave de API diretamente no código (ex: `Main.java`) onde a requisição é feita.

4. Compile e execute o projeto com:

   ```bash
   javac Main.java
   java Main
   ```

   > 📝 *Nota:* Certifique-se de que `Main.java` é o arquivo com o método `main` principal.

## 📁 Estrutura do Projeto

```
APOD_NASA_API/
├── nasa-apod-client/
│   ├── Main.java
│   └── utils/
│       └── ApiClient.java
├── .idea/
│   └── config files
└── README.md
```

## 💡 Possíveis Melhorias

- Interface gráfica (GUI) com JavaFX ou Swing  
- Agendamento automático de execução diária  
- Armazenamento das imagens em cache local


---

👨‍💻 Feito com dedicação por [Matheus Eduardo](https://github.com/MatheusxEduardo)

