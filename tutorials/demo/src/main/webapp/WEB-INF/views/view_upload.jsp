<!DOCTYPE html>
<html>
  <head>
    <meta name="viewport" content="width=device-width, initial-scale=1">  
    <title>CSV to HTML Table | Javacodepoint</title>
  </head>
  <body>
    <h2>Upload a CSV file to display in HTML Table</h2>
    <!-- Input element to upload an csv file -->
    <input type="file" id="file_upload" />
    <button onclick="upload()">Upload</button>  
    <br>
    <br>
    <!-- table to display the csv data -->
    <table id="display_csv_data" border="1"></table>
    <script>
     
      // Method to upload a valid csv file
      function upload() {
        var files = document.getElementById('file_upload').files;
        if(files.length==0){
          alert("Please choose any file...");
          return;
        }
        var filename = files[0].name;
        var extension = filename.substring(filename.lastIndexOf(".")).toUpperCase();
        if (extension == '.CSV') {
            //Here calling another method to read CSV file into json
            csvFileToJSON(files[0]);
        }else{
            alert("Please select a valid csv file.");
        }
      }
       
      //Method to read csv file and convert it into JSON 
      function csvFileToJSON(file){
          try {
            var reader = new FileReader();
            reader.readAsBinaryString(file);
            reader.onload = function(e) {
                var jsonData = [];
                var headers = [];
                var rows = e.target.result.split("\r\n");   
                //alert("rows >>>"+ rows);
                for (var i = 0; i < rows.length; i++) {
                    var cells = rows[i].split(",");
                    //alert("cells >>"+ cells);
                    var rowData = {};
                    for(var j=0;j<cells.length;j++){
                        if(i==0){
                            var headerName = cells[j].trim();
                            //alert("headerName >>"+ headerName);
                            headers.push(headerName);
                            //alert("headers >>"+ headers);
                        }else{
                            var key = headers[j];
                            if(key){
                                rowData[key] = cells[j].trim();
                            }
                        }
                    }
                     
                    if(i!=0){
                        jsonData.push(rowData);
                    }
                }
                  
                //displaying the json result into HTML table
                displayJsonToHtmlTable(jsonData);
                }
            }catch(e){
                console.error(e);
            }
      }
       
      //Method to display the data in HTML Table
      function displayJsonToHtmlTable(jsonData){
        var table=document.getElementById("display_csv_data");
        if(jsonData.length>0){
            var headers = Object.keys(jsonData[0]);
            var htmlHeader='<thead><tr>';
             
            for(var i=0;i<headers.length;i++){
                htmlHeader+= '<th>'+headers[i]+'</th>';
            }
            htmlHeader+= '<tr></thead>';
             
            var htmlBody = '<tbody>';
            for(var i=0;i<jsonData.length;i++){
                var row=jsonData[i];
                htmlBody+='<tr>';
                for(var j=0;j<headers.length;j++){
                    var key = headers[j];
                    htmlBody+='<td>'+row[key]+'</td>';
                }
                htmlBody+='</tr>';
            }
            htmlBody+='</tbody>';
            table.innerHTML=htmlHeader+htmlBody;
        }else{
            table.innerHTML='There is no data in CSV';
        }
      }
    </script>
  </body>
</html>