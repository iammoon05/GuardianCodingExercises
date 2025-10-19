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

    fun validWords(playerRack: CharArray, dictionary: ArrayList<String>) : ArrayList<String> {
        val rackCount = IntArray(26){0}
        for (c in playerRack) {
            rackCount[c - 'A']++
        }
        val result: ArrayList<String> = ArrayList<String>()

        for (word in dictionary) {
            val currentWordCharCount = IntArray(26){0}
            for (c in word.toCharArray()) {
                currentWordCharCount[c - 'A']++
            }

            var valid = true
            for (i in 0..26) {
                if (rackCount[i] < currentWordCharCount[i]) {
                    valid = false
                    break
                }
            }
            if (valid) {
                result.add(word)
            }
        }
        return result
    }
}