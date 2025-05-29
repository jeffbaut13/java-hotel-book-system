# Guía de uso de la API del Hotel

Esta guía explica el uso de todos los endpoints disponibles en el sistema backend del hotel. La estructura sigue el orden lógico de operaciones necesarias.

## Validación y documentacion en

`/swagger-ui/index.html#/`

## Importar las colecciones de Postman

archivo de importacion postamanCollection.json

A continuación se detallan los endpoints disponibles, organizados por las operaciones que se pueden realizar en el sistema en orden propuesto, sin embargo puede variar el orden y sus usos, dichos endpoints tiene su funcionalidad de get el cual si no hay datos aparecera un array vacio [], muchos dependen de otros para funcionar aun faltaria implementar un sistema de captura de errores, son necesarios, para que el usuario pueda saber si algo salio mal, por ahora se retornara un mensaje de error en caso de que algo falle.

## Tabla de Contenidos

# Ejemplo de Uso de la API del Hotel

## Introducción

## 1. Crear un Cliente  

**POST** `/api/clientes` 
```json
{
  "cedula": 1,
  "nombre": "Juan",
  "tipoIdentificacion": "CC"
}
```json
{
  "cedula": 2,
  "nombre": "Jesus",
  "tipoIdentificacion": "1000000"
}
```

---

## 1.1 Crear una Factura

**POST** `/api/facturas`

```json
{
  "total": 100000,
  "subtotal": 85000,
  "iva": 12000,
  "inc": 3000,
  "descuento": 5000,
  "categoria": "hospedaje",
  "fechaHora": "2025-05-26"
}
```

---

## 2. Crear una Reserva

**POST** `/api/reservas`

> Requiere cliente y factura creados.

```json
{
  "fechaReserva": "2025-05-28",
  "estado": "activa",
  "fechaInicio": "2025-06-01",
  "fechaFin": "2025-06-05",
  "cliente": {
    "cedula": 1
  },
  "factura": {
    "idFactura": 1
  }
}
```

---

## 3. Crear un Visitante (Huésped)

**POST** `/api/visitantes`

```json
{
  "cedula": 1030254584,
  "nombre": "Cathe",
  "apellido": "Bonnet",
  "tipoIdentificacion": "CC",
  "edad": 32,
  "genero": "femenino"
}
```

---

## 4. Asignar Visitantes a una Reserva

**POST** `/api/reserva-visitantes`

> Con un solo visitante:

```json
{
  "reserva": {
    "idReserva": 1
  },
  "visitantes": [
    {
      "cedula": 1030254584
    }
  ],
  "fechaReserva": "2025-05-28"
}
```

> Con múltiples visitantes:

```json
{
  "reserva": {
    "idReserva": 1
  },
  "visitantes": [
    {
      "cedula": 1030254584
    },
    {
      "cedula": 1030254585
    }
  ],
  "fechaReserva": "2025-05-28"
}
```

---

## 5. Crear Categoría de Cama

**POST** `/api/categoria-cama`

```json
{
  "tipo": "doble",
  "medidas": "1.4m x 1.9m",
  "fotoUrl": "https://example.com/foto.jpg",
  "color": "azul"
}
```

---

## 6. Crear Cama

**POST** `/api/camas`

```json
{
  "reciboUrl": "https://example.com/recibo.jpg",
  "fechaCama": "2025-05-20",
  "categoria": {
    "idCategoriaCama": 1
  }
}
```

---

## 7. Crear Categoría de Habitación

**POST** `/api/categoria-habitacion`

Campos disponibles: nombre, precioNoche, fotoUrl, descripcion, tv, aireAcondicionado, coberturaNoctura, etc.

```json
{
  "nombre": "ex ut",
  "precioNoche": 660003,
  "fotoUrl": "sed",
  "descripcion": "in reprehenderit est volupta",
  "tv": true,
  "aireAcondicionado": true,
  "coberturaNoctura": false,
  "veinticuatroHoras": false,
  "cafetera": true,
  "minibar": true,
  "cajaSeguridad": true,
  "leedAutomatizada": false,
  "servicioHuesped": false,
  "despertador": false,
  "portatil": true,
  "secador": false,
  "telefono": false,
  "vistaAlmar": false
}
```

---

## 8. Crear Habitación

**POST** `/api/habitaciones`

```json
{
  "nombre": "101",
  "piso": 1,
  "telefono": 123456,
  "categoriaHabitacion": {
    "idCategoriaHabitacion": 1
  }
}
```

---

## 9. Asignar Camas a Habitación

**POST** `/api/cama-habitacion`

```json
{
  "idCama": 1,
  "idHabitacion": 1,
  "estado": "ocupada"
}
```

---

## 10. Asociar Reserva y Habitación

**POST** `/api/reserva-habitacion`

```json
{
  "idReserva": 1,
  "idHabitacion": 1,
  "cantidad": 2
}
```

---

## 11. Crear Recepción de Habitación

**POST** `/api/recepcion-habitacion`

```json
{
  "fecha": "2025-06-01",
  "idHabitacion": 1,
  "categoria": "entrada"
}
```

---

## 12. Crear Recepción de Huésped

**POST** `/api/recepcion-huesped`

```json
{
  "idRecepcion": 1,
  "idHuesped": 1030254584,
  "fechaRecepcion": "2025-06-01"
}
```
