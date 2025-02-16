function llenarTabla(data) {
	var tableHTML = "<tr><th>Nombre</th><th>Población</th><th>Superficie (km²)</th></tr>";
	var obj = JSON.parse(data);
	var municipios = obj.municipios;


	municipios.forEach(municipio => {
		tableHTML += `<tr>
                        <td>${municipio.NOMBRE}</td>
                        <td>${municipio.POBLACION_MUNI}</td>
                        <td>${municipio.SUPERFICIE}</td>
                      </tr>`;
	});


	document.getElementById("tabla").innerHTML = tableHTML;
}


function cargarMunicipios() {
	const provinciaId = document.getElementById("provincias").value;
	const apiUrl = `https://www.el-tiempo.net/api/json/v2/provincias/${provinciaId}/municipios`;


	fetch(apiUrl)
		.then(response => response.json())  // Convertir la respuesta a JSON
		.then(data => llenarTabla(JSON.stringify(data))) // Llamar a la función de llenado
		.catch(error => console.error("Error al cargar datos:", error));
}
