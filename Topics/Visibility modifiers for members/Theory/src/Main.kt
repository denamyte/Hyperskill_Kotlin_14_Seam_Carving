import java.io.File

// You can experiment here, it won’t be checked

fun main(args: Array<String>) {

    // with File
    val completedProjects: File = File("/home/denys/projects/kotlin/hyperskill/test/test_dir/")
    val projects = completedProjects.walk()
    projects.maxDepth(2).forEach(::println)

// with Path
//    val completedProjects: Path = Path("/Files/CompletedProjects")
//    val projects = Files.walk(completedProjects, 1)
}
