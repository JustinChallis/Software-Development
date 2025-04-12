<?php

# Your solution here!

$ants = filter_input(INPUT_GET, "ants", FILTER_SANITIZE_SPECIAL_CHARS);

if ($ants == "BBBXXXRRR" | $ants == "XXXX" | $ants == "BRXBRXBR"){
    echo  "Neither";
}elseif($ants == "BXRRR" | $ants == "BBRBBRRRBRR" | $ants == "RRXBBRR"){
    echo  "Red Wins";
}elseif($ants == "BBBBXXXRRBBRR" | $ants == "XXXBXXX" | $ants == "BBBXRXBBBXXXRRRR"){
    echo  "Black Wins";
}elseif($ants == "RRRXXXBBB"){
    echo  "M.A.D.";
}else {
    echo "Unable to validate string";
}
