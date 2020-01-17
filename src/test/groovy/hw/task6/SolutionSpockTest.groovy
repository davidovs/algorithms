package hw.task6

import spock.lang.Specification

class SolutionSpockTest extends Specification {

    private Solution solution = new Solution()

    def "null list is equal to null list"() {
        expect:
        solution.execute(null, null)
    }

    def "the same list is equal to itself"() {
        List<Integer> list = Arrays.asList(1, 2, 3)
        expect:
        solution.execute(list, list)
    }

    def "null compares with a list with elements"() {
        expect:
        !solution.execute(null, Arrays.asList(1, 2, 3))
    }

    def "a list with elements compares with null"() {
        expect:
        !solution.execute(Arrays.asList(1, 2, 3), null)
    }

    def "different places elements occur once"() {
        expect:
        solution.execute(Arrays.asList(1, 2, 3), Arrays.asList(3, 2, 1))
    }

    def "lists with different size"() {
        expect:
        !solution.execute(Arrays.asList(1, 2, 3), Arrays.asList(3, 2, 1, 1))
    }

    def "different places, an element occurs twice"() {
        expect:
        solution.execute(Arrays.asList(1, 2, 1, 3), Arrays.asList(3, 2, 1, 1))
    }

    def "different places, contains zero element"() {
        expect:
        solution.execute(Arrays.asList(1, 2, 1, 3, 0), Arrays.asList(3, 2, 0, 1, 1))
    }

    def "same elements, but different times occur"() {
        expect:
        !solution.execute(Arrays.asList(1, 2, 2, 3, 0), Arrays.asList(3, 2, 0, 1, 1))
    }

    def "different places also with negative integers"() {
        expect:
        solution.execute(Arrays.asList(1, 2, 1, -1, 3, 0, -1), Arrays.asList(-1, 3, 2, -1, 0, 1, 1))
    }
}
