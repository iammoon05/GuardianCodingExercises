class Scrabble {

    fun calculateScore(inputWord: String, scoreMap: HashMap<Char, Int>): Int {
        val inputCharArray: CharArray = inputWord.uppercase().toCharArray()
        var score = 0
        for (c in inputCharArray) {
            score += scoreMap[c] ?: 0
        }
        return score
    }

    fun createDistributedArray(distributionMap: HashMap<Char, Int>): CharArray {
        val result = ArrayList<Char>()
        for ((key, value) in distributionMap) {
            repeat(value) { result.add(key) }
        }
        return result.toCharArray()
    }

    fun createDistributedRack(rackLength: Int, distArray: CharArray) : CharArray {
        val result = CharArray(rackLength)
        for (i in 0..rackLength) {
            result[i] = distArray.random()
        }
        return result
    }
}