package com.example.recyclerviewpractice

class BioDataRepository{
    private val bioDataList = listOf(
        "Enthusiastic software developer with a passion for creating innovative solutions.",
        "Adventurous traveler who loves exploring new cultures and trying exotic foods.",
        "Dedicated fitness enthusiast committed to a healthy and active lifestyle.",
        "Aspiring artist who expresses creativity through various forms of visual arts.",
        "Tech-savvy individual with a keen interest in the latest advancements in technology.",
        "Passionate bookworm who enjoys diving into different genres of literature.",
        "Nature lover and environmental advocate, actively involved in conservation efforts.",
        "Talented musician skilled in playing multiple instruments and composing music.",
        "Avid photographer capturing moments and emotions through the lens.",
        "Curious learner always seeking to acquire new knowledge and skills.",
        "Social justice advocate working towards a more inclusive and equitable society.",
        "Foodie with a flair for cooking and experimenting with diverse cuisines.",
        "Sports enthusiast actively participating in various athletic activities.",
        "Humanitarian dedicated to volunteering and making a positive impact on communities.",
        "Fashionista with a unique sense of style and a passion for fashion design.",
        "Gamer and esports enthusiast with a competitive spirit.",
        "Health and wellness guru promoting holistic well-being and mindfulness.",
        "Creative storyteller who crafts compelling narratives through writing and storytelling.",
        "Tech entrepreneur building innovative solutions to address real-world challenges.",
        "Science aficionado fascinated by the wonders of the natural world."
    )
    fun getBioDataForPerson(index: Int): String {
        // Handle index out of bounds if needed
        return bioDataList.getOrElse(index - 1) { "" }
    }
}