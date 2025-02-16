const apiKey = 'eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ5cnV3ZWlxb0B5b3BtYWlsLmNvbSIsImp0aSI6ImFkMWJiYTYwLTk3M2MtNDFmZC1iOTRjLTExZmZhNGQyOWVjMyIsImlzcyI6IkFFTUVUIiwiaWF0IjoxNzM3NzIxODU5LCJ1c2VySWQiOiJhZDFiYmE2MC05NzNjLTQxZmQtYjk0Yy0xMWZmYTRkMjllYzMiLCJyb2xlIjoiIn0.47m_PiiIUU2732yFycUV1g0nLY7LYoiFGhuzNDtrNB8';  // Sustituye con tu clave API de AEMET


function consultarTiempo() {
	const ciudadId = document.getElementById("ciudad").value;
	const apiUrl = `https://opendata.aemet.es/opendata/api/prediccion/especifica/municipio/diaria/${ciudadId}/?api_key=${apiKey}`;


	fetch(apiUrl)
		.then(response => response.json())
		.then(data => obtenerDatosTiempo(data.datos))
		.catch(error => console.error("Error al obtener los datos del tiempo:", error));
}


function obtenerDatosTiempo(urlDatos) {
	fetch(urlDatos)
		.then(response => response.json())
		.then(datos => {
			const prediccion = datos[0].prediccion.dia[0];
			document.getElementById("resultado").innerHTML = `
                <h2>Tiempo para hoy:</h2>
                <p>Ciudad: ${datos[0].nombre}</p>
                <p>Temperatura máxima: ${prediccion.temperatura.maxima}°C</p>
                <p>Temperatura mínima: ${prediccion.temperatura.minima}°C</p>
                <p>Estado del cielo: ${prediccion.estadoCielo.descripcion}</p>
            `;
		})
		.catch(error => console.error("Error al procesar los datos:", error));
}
