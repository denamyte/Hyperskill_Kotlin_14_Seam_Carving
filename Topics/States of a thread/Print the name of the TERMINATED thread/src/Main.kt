fun printNameOfTerminatedThread(threads: List<Thread>) =
    threads.filter(::isTerminated)
        .map { it.name }
        .forEach(::println)

private fun isTerminated(t: Thread) = t.state == Thread.State.TERMINATED