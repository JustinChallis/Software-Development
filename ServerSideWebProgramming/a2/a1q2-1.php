<?php

# Your solution here!
$numberToFactor = filter_input(INPUT_POST, "n", FILTER_VALIDATE_INT);
if (!empty($numberToFactor)){

for($x = 1; $x < $numberToFactor; $x++){
    if (($numberToFactor % $x) == 0){
        echo "$x" . "Is a factor of" . $numberToFactor . "<br/>";
    }
}
}else {
    echo "Input not set";
}
