package com.example.whatsappui.data

import com.example.whatsappui.domain.ChatListDataObject
import com.example.whatsappui.domain.Message
import com.example.whatsappui.domain.MessageDeliveryStatus
import com.example.whatsappui.domain.MessageType

val chatsList = listOf<ChatListDataObject>(
    ChatListDataObject(
        chatId = 1,
        message = Message(
            content = "Good Morning.",
            timeStamp = "27/11/2024",
            type= MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED,
            unreadCount= null
        ),
        userName = "Shawn",

        ),
    ChatListDataObject(
        chatId = 2,
        message = Message(
            content = "Charles!!!",
            timeStamp = "27/11/2024",
            type= MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED,
            unreadCount= 6

        ),
        userName = "Zahabiya",
    ),
    ChatListDataObject(
        chatId = 1,
        message = Message(
            content = "Listen to Brent Faiyaz",
            timeStamp = "07/11/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED,
            unreadCount = null
        ),
        userName = "Hafsah Siti"
    ),
    ChatListDataObject(
        chatId = 2,
        message = Message(
            content = "📍 Current Location",
            timeStamp = "06/11/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.PENDING,
            unreadCount = 5
        ),
        userName = "Wangithi Yvonne"
    ),
    ChatListDataObject(
        chatId = 3,
        message = Message(
            content = "IMG_20241105_153022.jpg",
            timeStamp = "05/11/2024",
            type = MessageType.IMAGE,
            deliveryStatus = MessageDeliveryStatus.READ,
            unreadCount = 3
        ),
        userName = "Project Team Group"
    ),
    ChatListDataObject(
        chatId = 4,
        message = Message(
            content = "Meeting minutes attached",
            timeStamp = "05/11/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.READ,
            unreadCount = null
        ),
        userName = "Rudel"
    ),
    ChatListDataObject(
        chatId = 5,
        message = Message(
            content = "🎵 Voice Message (0:32)",
            timeStamp = "04/11/2024",
            type = MessageType.AUDIO,
            deliveryStatus = MessageDeliveryStatus.DELIVERED,
            unreadCount = 1
        ),
        userName = "Mom"
    ),
    ChatListDataObject(
        chatId = 6,
        message = Message(
            content = "Sure, I'll be there in 10 minutes",
            timeStamp = "04/11/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.PENDING,
            unreadCount = null
        ),
        userName = "Rose"
    ),
    ChatListDataObject(
        chatId = 7,
        message = Message(
            content = "Contact: Alice Johnson",
            timeStamp = "03/11/2024",
            type = MessageType.VIDEO,
            deliveryStatus = MessageDeliveryStatus.DELIVERED,
            unreadCount = null
        ),
        userName = "Raphael"
    ),
    ChatListDataObject(
        chatId = 8,
        message = Message(
            content = "video_call_20241102.mp4",
            timeStamp = "02/11/2024",
            type = MessageType.VIDEO,
            deliveryStatus = MessageDeliveryStatus.READ,
            unreadCount = 5
        ),
        userName = "Maina Family"
    ),
    ChatListDataObject(
        chatId = 9,
        message = Message(
            content = "Thanks for the birthday wishes! 🎉",
            timeStamp = "01/11/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED,
            unreadCount = null
        ),
        userName = "Tallam"
    ),
    ChatListDataObject(
        chatId = 10,
        message = Message(
            content = "👍",
            timeStamp = "31/10/2024",
            type = MessageType.IMAGE,
            deliveryStatus = MessageDeliveryStatus.DELIVERED,
            unreadCount = 2
        ),
        userName = "Tech Support"
    ),
    ChatListDataObject(
        chatId = 1,
        message = Message(
            content = "Good Morning ",
            timeStamp = "07/11/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED,
            unreadCount = null
        ),
        userName = "Shawn "
    ),
    ChatListDataObject(
        chatId = 2,
        message = Message(
            content = "📍 Current Location",
            timeStamp = "06/11/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.READ,
            unreadCount = null
        ),
        userName = "Herway"
    ),
    ChatListDataObject(
        chatId = 3,
        message = Message(
            content = "IMG_20241105_153022.jpg",
            timeStamp = "05/11/2024",
            type = MessageType.IMAGE,
            deliveryStatus = MessageDeliveryStatus.PENDING,
            unreadCount = 3
        ),
        userName = "ICS 3E"
    ),
    ChatListDataObject(
        chatId = 4,
        message = Message(
            content = "Meeting minutes attached",
            timeStamp = "05/11/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.PENDING,
            unreadCount = null
        ),
        userName = "Zubeir"
    ),
    ChatListDataObject(
        chatId = 5,
        message = Message(
            content = "🎵 Voice Message (0:32)",
            timeStamp = "04/11/2024",
            type = MessageType.AUDIO,
            deliveryStatus = MessageDeliveryStatus.DELIVERED,
            unreadCount = 1
        ),
        userName = "Dad"
    ),
    ChatListDataObject(
        chatId = 6,
        message = Message(
            content = "Sure, I'll be there in 10 minutes",
            timeStamp = "04/11/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus. PENDING,
            unreadCount = null
        ),
        userName = "Austin"
    ),
    ChatListDataObject(
        chatId = 7,
        message = Message(
            content = "Contact: Alice Johnson",
            timeStamp = "03/11/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED,
            unreadCount = null
        ),
        userName = "Sean R "
    ),
    ChatListDataObject(
        chatId = 8,
        message = Message(
            content = "video_call_20241102.mp4",
            timeStamp = "02/11/2024",
            type = MessageType.VIDEO,
            deliveryStatus = MessageDeliveryStatus.PENDING,
            unreadCount = 5
        ),
        userName = "Salim"
    ),
    ChatListDataObject(
        chatId = 9,
        message = Message(
            content = "Thanks for the birthday wishes! 🎉",
            timeStamp = "01/11/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.READ,
            unreadCount = null
        ),
        userName = "Lisa PAYF"
    ),
    ChatListDataObject(
        chatId = 10,
        message = Message(
            content = "👍",
            timeStamp = "31/10/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED,
            unreadCount = 2
        ),
        userName = "ICS 3D"
    ),
    ChatListDataObject(
        chatId = 11,
        message = Message(
            content = "Project_Proposal_V2.pdf",
            timeStamp = "30/10/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.PENDING,
            unreadCount = null
        ),
        userName = "Computer Graphics Group"
    ),
    ChatListDataObject(
        chatId = 12,
        message = Message(
            content = "🎮 Let's go for a drive tonight!",
            timeStamp = "30/10/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED,
            unreadCount = 4
        ),
        userName = "Cars"
    ),
    ChatListDataObject(
        chatId = 13,
        message = Message(
            content = "presentation_slides.pptx",
            timeStamp = "29/10/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.ERROR,
            unreadCount = null
        ),
        userName = "Betty"
    ),
    ChatListDataObject(
        chatId = 14,
        message = Message(
            content = "🎵 Voice Message (1:45)",
            timeStamp = "29/10/2024",
            type = MessageType.AUDIO,
            deliveryStatus = MessageDeliveryStatus.READ,
            unreadCount = 2
        ),
        userName = "Archery Group"
    ),
    ChatListDataObject(
        chatId = 16,
        message = Message(
            content = "IMG_20241028_092033.jpg",
            timeStamp = "28/10/2024",
            type = MessageType.IMAGE,
            deliveryStatus = MessageDeliveryStatus.PENDING,
            unreadCount = null
        ),
        userName = "Artificial Intelligence Group 1"
    ),
    ChatListDataObject(
        chatId = 17,
        message = Message(
            content = "📍 Meeting Point",
            timeStamp = "27/10/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED,
            unreadCount = 1
        ),
        userName = "Hiking Club"
    ),
    ChatListDataObject(
        chatId = 18,
        message = Message(
            content = "birthday_celebration.mp4",
            timeStamp = "27/10/2024",
            type = MessageType.VIDEO,
            deliveryStatus = MessageDeliveryStatus.PENDING,
            unreadCount = 6
        ),
        userName = "Niisha's 21'st Birthday"
    ),
    ChatListDataObject(
        chatId = 19,
        message = Message(
            content = "❤️",
            timeStamp = "26/10/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.READ,
            unreadCount = null
        ),
        userName = "Niisha"
    ),
    ChatListDataObject(
        chatId = 20,
        message = Message(
            content = "Weekly report updated",
            timeStamp = "26/10/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED,
            unreadCount = 3
        ),
        userName = "Mobile App Group 3"
    )
)
