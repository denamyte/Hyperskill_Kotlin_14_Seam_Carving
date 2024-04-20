// Do NOT modify the following function
fun addDaysToDate(inputDate: String, inputDays: Int): String {
    val dateFormat = DateFormat.getDateInstance(DateFormat.LONG)

    val calendar = Calendar.getInstance()
    val date = dateFormat.parse(inputDate)
    calendar.time = date
    calendar.add(Calendar.DATE, inputDays)
    val newDate = calendar.time
    return dateFormat.format(newDate)
}