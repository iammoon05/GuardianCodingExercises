class Scrabble {

    fun calculateScore(inputWord: String, scoreMap: HashMap<Char, Int>): Int {
        var inputCharArray: CharArray = inputWord.uppercase().toCharArray()
        var score: Int = 0
        for (c in inputCharArray) {
            score += scoreMap[c] ?: 0
        }
        return score
    }

    fun createDistributedArray(distributionMap: HashMap<Char, Int>): CharArray {
        var result = ArrayList<Char>()
        for ((key, val) in distributionMap) {
            result.add()
        }
    }
}