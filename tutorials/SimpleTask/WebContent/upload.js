console.log("link");
const excel_file = document.getElementById('input');
excel_file.addEventListener('change', (event) => {
    document.getElementById('excel_data').innerHTML = '';


    if(!['application/vnd.openxmlformats-officedocument.spreadsheetml.sheet', 'application/vnd.ms-excel'].includes(event.target.files[0].type))
    {
    	alert('invalid');
    	document.getElementById('showData').innerHTML = '';
        document.getElementById('excel_data').innerHTML = '<div class="alert alert-danger">Only .xlsx or .xls file format are allowed</div>';
        return false;
    }
    var reader = new FileReader();
    reader.readAsArrayBuffer(event.target.files[0]);
    reader.onload = function(event){
        var data = new Uint8Array(reader.result);
        var workbook = XLSX.read(data, {type:'array'});
        workbook.SheetNames.forEach(sheet => {
            let rowObject = XLSX.utils.sheet_to_row_object_array(workbook.Sheets[sheet]);
            if(rowObject.length<=0){
                document.getElementById('excel_data').innerHTML = '<div class="alert alert-danger">uploaded excel is blank</div>';
                return false;
            }
            document.getElementById("jsonValue").value = JSON.stringify(rowObject,undefined,4);
            var jsAtt = JSON.stringify(rowObject,undefined,4);
            jsAtt = jsAtt.replaceAll(/\n/g,' ').replaceAll(/\r/g,' ').replaceAll(/\s/g,' ');
    	    const myBooks = JSON.parse(jsAtt);
        	    let col = [];
        	    for (let i = 0; i < myBooks.length; i++) {
        	      for (let key in myBooks[i]) {
        	        if (col.indexOf(key) === -1) {
        	          col.push(key);
        	        }
        	      }
        	    }
        	    // Create table.
        	    const table = document.createElement("table");
        	    // Create table header row using the extracted headers above.
        	    let tr = table.insertRow(-1);                   // table row.
        	    for (let i = 0; i < col.length; i++) {
        	      let th = document.createElement("th");      // table header.
        	      th.innerHTML = col[i];
        	      tr.appendChild(th);
        	    }
        	    // add json data to the table as rows.
        	    for (let i = 0; i < myBooks.length; i++) {

        	      tr = table.insertRow(-1);

        	      for (let j = 0; j < col.length; j++) {
        	        let tabCell = tr.insertCell(-1);
        	        tabCell.innerHTML = myBooks[i][col[j]];
        	      }
        	    }
        	    // Now, add the newly created table with json data, to a container.
        	    const divShowData = document.getElementById('showData');
        	    divShowData.innerHTML = "";
        	    divShowData.appendChild(table);
            
            
       });
    }
});