# Actividad-Obligatoria-2
# Concesionaria - Java POO

Sistema de gestión de vehículos desarrollado en *Java* utilizando los conceptos de *Programación Orientada a Objetos*.

## 📋 Descripción
Este proyecto modela una concesionaria de vehículos con dos tipos de productos: **Autos** y **Motos**. 
Incluye funcionalidades de carga, búsqueda, ordenamiento y generación de reportes.

## ✨ Funcionalidades
- **Herencia**: Clase abstracta `Vehiculo` con subclases `Auto` y `Moto`.
- **Interfaz**: `IServicio` que define los contratos del sistema.
- **Comparable**: Implementación de ordenamiento natural por marca, modelo y precio.
- **Búsquedas**:
  - Vehículo más caro
  - Vehículo más barato
  - Vehículo por letra en el modelo
- **Ordenamientos**:
  - Por precio descendente
  - Por orden natural
- **Formato de precios** con separador de miles.

## 🛠️ Tecnologías y Herramientas
- **Lenguaje**: Java
- **Lombok**
- **Spring Web**
- **Paradigma**: Programación Orientada a Objetos (Herencia, Polimorfismo, Interfaces)

## 📁 Estructura del Proyecto
src/
├── ar/com/centro8/java/concesionaria/
│   ├── entidades/
│   │   ├── Vehiculo.java          (abstracta)
│   │   ├── Auto.java
│   │   └── Moto.java
│   ├── interfaces/
│   │   └── IServicio.java
│   └── tests/
│       └── TestConcesionaria.java  (implementa IServicio)
