package ru.netology.coroutines.dto

data class PostWithComments(
    val post: Post,
    val comments: List<Comment>,
)

data class PostWithCommentsAndAuthors(
    val post: Post,
    val author: Author,
    val comments: List<Comment>,
)
