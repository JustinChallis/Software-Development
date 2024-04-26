const quotes = ["Applause is the spur of noble minds, the end and aim of weak ones.",
"It takes courage to know when you ought to be afraid.",
"If any good results to a man from believing a lie, it certainly comes from the honesty of his belief.",
"Fatigue is the best pillow.",
"If I ever said in grief or pride, I tired of honest things, I lied.",
"There are things I can't force. I must adjust.",
"Music is only sound expressing certain patterns, so to what extent is that sound architecture and to what extent theatre?",
"He that fears not the future may enjoy the present."
]

const usedIndexes = new Set()
const quoteElement = document.getElementById("quote")

function generateQuote(){
    if (usedIndexes.size >= quotes.length){
        usedIndexes.clear()
    }

    while (true){
        const randomIdx = Math.floor(Math.random() * quotes.length)

        if (usedIndexes.has(randomIdx)) continue

        const quote = quotes[randomIdx]
        quoteElement.innerHTML = quote;
        usedIndexes.add(randomIdx)
        break
    }
    
}