# Employed API

RESTful API sederhana menggunakan Spring Boot untuk otentikasi pengguna berbasis JWT dan pengambilan data karyawan dari API eksternal.

## 📌 Fitur Utama

- Login dengan username dan password menggunakan JWT
- Proteksi endpoint menggunakan JWT filter
- Ambil data karyawan dari `https://dummy.restapiexample.com/api/v1/employees`
- Struktur respon yang konsisten menggunakan wrapper
- Konfigurasi keamanan dengan Spring Security

---

## 🔧 Teknologi

- Java 17+
- Spring Boot
- Spring Security
- JWT (JSON Web Token)
- REST API
- Maven

---

## 🚀 Cara Menjalankan Aplikasi

- mvn clean install
- mvn spring-boot:run

## 🚀 Cara Menggunakan API
- Login API
Endpoint = POST /api/login
- Request Body =
{
  "username": "Hello_Admin",
  "password": "User1234"
}
- Response = 
{
  "token": "JWT_TOKEN_HERE"
}

- Membaca data API
Endpoint = GET /api/employees
- Header = 
Key = Auth 
Value = Token <JWT_TOKEN>
- Response = 
{
  "message": "Success: Retrieved employees",
  "result": [
    {
      "id": 1,
      "employee_name": "Tiger Nixon",
      "employee_salary": 320800,
      "employee_age": 61,
      "profile_image": ""
    },
    ...
  ]
}

### Clone Repository
```bash
git clone https://github.com/username/employed_api.git
cd employed_api

