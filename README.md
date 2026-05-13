<div align="center">

<img width="220" src="https://cdn-icons-png.flaticon.com/512/2838/2838912.png" />

# 🧾 POS API System

### API REST para sistema de punto de ventas con Spring Boot 🚀

<p align="center">
  <b>POS API System</b> es una API REST desarrollada con Spring Boot para gestionar operaciones de un sistema de punto de ventas, incluyendo productos, clientes, ventas, inventario y autenticación.
</p>

<p align="center">
  <img src="https://img.shields.io/badge/SpringBoot-Framework-6DB33F?style=for-the-badge&logo=springboot&logoColor=white">
  <img src="https://img.shields.io/badge/Java-Backend-orange?style=for-the-badge&logo=java&logoColor=white">
  <img src="https://img.shields.io/badge/MySQL-Database-4479A1?style=for-the-badge&logo=mysql&logoColor=white">
  <img src="https://img.shields.io/badge/REST-API-red?style=for-the-badge">
</p>

<p align="center">
  <a href="#-acerca-del-proyecto">Acerca</a> •
  <a href="#-características">Características</a> •
  <a href="#-tecnologías-utilizadas">Tecnologías</a> •
  <a href="#-endpoints">Endpoints</a> •
  <a href="#-instalación">Instalación</a>
</p>

</div>

---

# 🌌 Acerca del proyecto

**POS API System** es una API REST diseñada para administrar un sistema de punto de ventas moderno mediante servicios backend desarrollados en Spring Boot.

La API permite gestionar:

- 🛒 Productos
- 📦 Inventario
- 👥 Clientes
- 💳 Ventas
- 🧾 Tickets
- 🔐 Usuarios y autenticación
- 📊 Reportes

El proyecto fue desarrollado para practicar:

- Spring Boot
- Arquitectura REST
- JPA & Hibernate
- APIs empresariales
- Seguridad backend
- Bases de datos relacionales

---

# ✨ Características

## 🛒 Gestión de productos

- ➕ Crear productos
- ✏️ Actualizar información
- ❌ Eliminar productos
- 🔍 Buscar productos

---

## 📦 Inventario

- 📊 Control de stock
- 🔄 Actualización automática
- ⚠️ Alertas de inventario
- 📋 Gestión de categorías

---

## 👥 Clientes

- 👤 Registro de clientes
- 📞 Información de contacto
- 🧾 Historial de compras
- ⭐ Gestión personalizada

---

## 💳 Ventas

- 🛍️ Registro de ventas
- 🧾 Generación de tickets
- 💰 Cálculo automático
- 📈 Reportes comerciales

---

## 🔐 Seguridad

- 🔑 JWT Authentication
- 👥 Roles y permisos
- 🛡️ Protección de endpoints
- 🔒 Seguridad con Spring Security

---

# 🛠️ Tecnologías utilizadas

## ☕ Backend

<p>
  <img src="https://skillicons.dev/icons?i=java,spring,maven" />
</p>

- Java 17+
- Spring Boot
- Spring Security
- Spring Data JPA
- Maven

---

## 🗄️ Base de datos

<p>
  <img src="https://skillicons.dev/icons?i=mysql" />
</p>

- MySQL
- Hibernate
- JPA

---

## ⚙️ Herramientas

<p>
  <img src="https://skillicons.dev/icons?i=git,github,postman,vscode" />
</p>

- Git
- GitHub
- Postman
- VS Code

---

## ☁️ Deployment

<p>
  <img src="https://skillicons.dev/icons?i=docker" />
</p>

- Docker
- Docker Compose

---

# 📂 Estructura del proyecto

```bash
POS-API/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   ├── resources/
│   │   └── application.properties
│   │
│   └── test/
│
├── controllers/
├── services/
├── repositories/
├── entities/
├── dto/
├── security/
├── pom.xml
└── README.md
```

---

# ⚡ Instalación

## 📋 Requisitos

- Java 17+
- Maven
- MySQL
- Postman

---

# 🚀 Configuración del proyecto

## 1️⃣ Clonar repositorio

```bash
git clone https://github.com/usuario/pos-api-system.git
```

---

## 2️⃣ Entrar al proyecto

```bash
cd pos-api-system
```

---

## 3️⃣ Configurar base de datos

Editar:

```properties
src/main/resources/application.properties
```

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/posdb
spring.datasource.username=root
spring.datasource.password=123456
```

---

## 4️⃣ Instalar dependencias

```bash
mvn clean install
```

---

## 5️⃣ Ejecutar aplicación

```bash
mvn spring-boot:run
```

---

# 🌐 API Base URL

```bash
http://localhost:8080/api
```

---

# 🔌 Endpoints principales

## 🛒 Productos

| Método | Endpoint |
|---|---|
| GET | `/products` |
| GET | `/products/{id}` |
| POST | `/products` |
| PUT | `/products/{id}` |
| DELETE | `/products/{id}` |

---

## 👥 Clientes

| Método | Endpoint |
|---|---|
| GET | `/customers` |
| POST | `/customers` |
| PUT | `/customers/{id}` |
| DELETE | `/customers/{id}` |

---

## 💳 Ventas

| Método | Endpoint |
|---|---|
| GET | `/sales` |
| POST | `/sales` |
| GET | `/sales/{id}` |

---

## 🔐 Autenticación

| Método | Endpoint |
|---|---|
| POST | `/auth/login` |
| POST | `/auth/register` |

---

# 🔒 Seguridad JWT

## 📥 Login

```json
POST /auth/login
```

```json
{
  "email": "admin@test.com",
  "password": "123456"
}
```

---

## 📤 Respuesta

```json
{
  "token": "jwt-token"
}
```

---

# 📸 Vista previa

<div align="center">

<img width="1000" src="https://images.unsplash.com/photo-1556740749-887f6717d7e4?q=80&w=1200&auto=format&fit=crop" />

</div>

---

# 🧠 Objetivos del proyecto

## 🎯 Aprender y practicar

- Spring Boot
- APIs REST
- JWT Authentication
- Hibernate & JPA
- Arquitectura backend
- Sistemas POS
- CRUD empresarial

---

# 🚧 Roadmap

## 🔮 Próximas mejoras

- 📊 Dashboard analytics
- 🧾 Facturación electrónica
- ☁️ Deployment cloud
- 📱 Aplicación móvil
- 🔔 Notificaciones
- 📡 WebSockets en tiempo real
- 🤖 IA para reportes

---

# 🤝 Contribuciones

Las contribuciones son bienvenidas ❤️

## Cómo contribuir

1. Fork del proyecto

```bash
git checkout -b feature/new-feature
```

2. Commit de cambios

```bash
git commit -m "✨ Nueva funcionalidad"
```

3. Push al repositorio

```bash
git push origin feature/new-feature
```

4. Crear Pull Request 🚀

---

# 👨‍💻 Autor

<div align="center">

## Isai Reyes — Backend Developer

Desarrollador enfocado en APIs REST, arquitecturas empresariales y sistemas backend con Spring Boot.

</div>

---

# 🌟 Apoya el proyecto

⭐ Dale una estrella  
🍴 Haz fork  
📢 Comparte el proyecto

---

# 📜 Licencia

Proyecto educativo desarrollado para práctica de APIs REST y sistemas de punto de ventas con Spring Boot.

---

<div align="center">

### 🧾 POS API System — backend moderno para puntos de venta 🚀

</div>
