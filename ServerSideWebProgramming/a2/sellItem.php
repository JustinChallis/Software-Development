<?php

// Set header for returning JSON response
header('Content-Type: application/json');

// Get POST parameters
$shop = isset($_POST['shop']) ? (int)$_POST['shop'] : 0;  // Shop number
$item_json = isset($_POST['item']) ? $_POST['item'] : ''; // Item JSON string
$gold = isset($_POST['gold']) ? (int)$_POST['gold'] : 0;  // Player's gold

// Decode the item JSON
$item = json_decode($item_json, true);

if (!$item || !isset($item['id']) || !isset($item['price']) || !isset($item['name']) || !isset($item['description'])) {
    // If the item is invalid or missing required data, return an error
    echo json_encode([
        "success" => false,
        "message" => "The item is invalid. Please check the item details.",
        "gold" => $gold,
        "debug" => "Invalid item data."
    ]);
    exit;
}

// Item details
$itemId = $item['id'];
$itemName = $item['name'];
$itemDescription = $item['description'];
$itemPrice = (int)$item['price']; // Item price (must be positive)

// Debug message to check the incoming data
$debugMessage = "Attempting to sell item: ID $itemId, Name $itemName, Price $itemPrice";

// Check if the item price is valid (greater than 0)
if ($itemPrice <= 0) {
    echo json_encode([
        "success" => false,
        "message" => "The item cannot be sold for a non-positive price.",
        "gold" => $gold,
        "debug" => $debugMessage . " | Invalid price."
    ]);
    exit;
}

// Process the sale
$gold += $itemPrice;  // Increase player's gold by item price

// Successful sale message
$message = "The shopkeeper happily accepts your $itemName for $itemPrice gold!";

// Debug message for the operation
$debugMessage .= " | Sale successful! Gold updated to $gold.";

// Respond with success
echo json_encode([
    "success" => true,
    "message" => $message,
    "gold" => $gold,
    "debug" => $debugMessage
]);

?>
