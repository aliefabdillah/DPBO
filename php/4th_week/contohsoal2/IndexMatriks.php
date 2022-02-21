<?php
include "Matriks.php";

/* inisialisasi data yang diterima jik ada kiriman sebelumnya */
$baris = $_REQUEST["Baris"] ?? "";
$kolom = $_REQUEST["Kolom"] ?? "";
$mat = $_REQUEST["mat"] ?? "";

?>

<html>
<head>
<title>Matriks</title>
</head>

<body>
<!-- form masukan untuk user -->
<form method="post">
    <table>
        <tr>
            <td>Baris</td>
            <td>:</td>
            <td><input type="text" name="baris" value="<?php echo $baris;?>"/></td>
        </tr>
        <tr>
            <td>Kolom</td>
            <td>:</td>
            <td><input type="text" name="kolom" value="<?php echo $kolom;?>"/></td>
        </tr>
   
<?php
    //jika telah ada masukan
    if ((!empty($baris)) && (!empty($kolom))) {
        $m = new Matriks();
        $m->setBaris($baris);
        $m->setKolom($kolom);
        
        //jika matriks telah di isi
        if (isset($mat[0][0])) {
            $mat->setMat($mat);
        }

        //menampilkan isi matriks
        for($i=0; $i<$baris; $i++){
            for($j=0; $j<$kolom; $j++){
                ?>

                <tr>
                    <td>Matriks [<?php echo $i; ?>][<?php echo $j; ?>]</td>
                    <td>:</td>
                    <td><input type="text" name="mat[<?php echo $i; ?>][<?php echo $j; ?>]" value="<?php if(isset($m->getMat()[0][0])){ echo $m->getMat()[$i][$j];} ?>"/></td>
                </tr>
                <?php
            }
        }
    }
?>

        <tr>
            <td span="3"><input type="submit" name="buat" value="  Kirim  "/></td>
        </tr>
    </table>
</form>
<?php
// menampilkan isi matriks jika telah terisi
if (isset($mat[0][0])) {
    for ($i=0; $i < $baris; $i++) { 
        for ($j=0; $j < $kolom; $j++) { 
            echo $m->getMat()[$i][$j]." ";
        }
        echo "<br/>";
    }
}

?>
</body>
</html>