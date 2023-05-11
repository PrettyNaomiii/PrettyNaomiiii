# PrettyNaomiiii
coding web browser (kode barang, nama barang, quantity)
<?php
$curl = curl_init();
$curl_setopt_array($curl, array
    CURLOPT_URL => ' http://farmasi.mimoapps.xyz/mimoqss2auyqDIEAlkgZCOhiffSsFl6QqAelGtM'
    CURLOPT_RETURNTRANSFER => true,
    CURLOPT_ENCODING => ''
    CURLOPT_MAXREDIRS => 10,
    CURLOPT_TIMEOUT => 0,
    CURLOPT_FOLLOWLOCATION => true,
    CURLOPT_HTTP_VERSION => CURL_HTTP_VERSION_1_1,
    CURLOPT_CUSTOMREQUEST => 'GET'
); 
$dbhost = 'hostname';
$dbuser = 'username';
$dbpass = 'password';
$dbname = 'database_name';

$conn = mysqli_connect($dbhost, $dbuser, $dbpass, $dbname);

if (!$conn) {
    die('Could not connect: ' . mysqli_error($conn));
}

// Fetch data from database
$sql = "SELECT * FROM inventory WHERE nama_barang LIKE 'L%'";
$result = mysqli_query($conn, $sql);

$data = array();
while ($row = mysqli_fetch_assoc($result)) {
    $data[] = $row;
}

echo "<table>";
echo "<tr><th>Kode Barang</th><th>Nama Barang</th><th>Harga Jual</th><th>Quantity</th></tr>";

foreach ($data as $row) {
    $kode_barang = $row['kode_barang'];
    $nama_barang = $row['nama_barang'];
    $harga_jual = $row['harga_jual'];
    $quantity = $row['quantity'];

    echo "<tr>";
    echo "<td>$kode_barang</td>";
    echo "<td>$nama_barang</td>";
    echo "<td>$harga_jual</td>";
    echo "<td>$quantity</td>";
    echo "</tr>";
}

echo "</table>";

mysqli_close($conn);
?>
