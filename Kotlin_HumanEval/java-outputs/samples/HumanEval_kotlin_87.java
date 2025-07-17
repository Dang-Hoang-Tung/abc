if (lst.isEmpty()) {
        return null
    }

    
    val sortedList = lst.sorted()

    
    if (sortedList.size < 2) {
        return null
    }

    
    return sortedList[1]
}