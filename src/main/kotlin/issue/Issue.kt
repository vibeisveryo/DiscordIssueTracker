package issue

class Issue(var title: String, owner: Long) {
    var owner: Long = owner //TODO implement participant to remove primitive usage
        private set
    val members: Map<Long, AccessLevel> = emptyMap()
    val labels: List<Label> = emptyList()
    val status: Status = Status.OPEN
}

data class Label(val text: String, val colour: String) //Colour is String as a placeholder

enum class Status {OPEN, CLOSED, REPEATING}

enum class AccessLevel {ASSIGNEE, WRITER, READER}