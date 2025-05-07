package pl.farmaprom.trainings.contactsapp.contacts.presentation.list

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.outlined.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalInspectionMode
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.skydoves.landscapist.glide.GlideImage
import pl.farmaprom.trainings.contactsapp.R
import pl.farmaprom.trainings.contactsapp.ui.theme.ContactsAppTheme
import pl.farmaprom.trainings.contactsapp.ui.theme.Dimens

@Composable
fun ContactItem(
    profileImageUrl: String,
    name: String,
    isFavourite: Boolean = false,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(8.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {

        GlideImage(
            imageModel = { profileImageUrl },
            modifier = Modifier
               .size(Dimens.contactListItemProfileImageSize)
               .clip(CircleShape)
        )

        Text(
            text = name,
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier
                .weight(1f)
                .padding(horizontal = 12.dp)
        )

        Icon(
            imageVector = if (isFavourite) Icons.Filled.Star else Icons.Outlined.Star,
            contentDescription = if (isFavourite) "Favourite Contact" else "Not Favourite Contact",
            tint = if (isFavourite) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.onSurface.copy(alpha = 0.6f)
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun ContactItemPreview() {
    ContactsAppTheme {
        val sampleImageUrl = "https://raw.githubusercontent.com/kamilruchalaf/trainingassets/main/assets/face1.png"
        ContactItem(
            profileImageUrl = sampleImageUrl,
            name = "Joe Doe",
            isFavourite = true
        )
    }
}
@Preview(showBackground = true)
@Composable
private fun ContactItemPreviewNotFavourite() {
    ContactsAppTheme {
        val sampleImageUrl = "https://raw.githubusercontent.com/kamilruchalaf/trainingassets/main/assets/face1.png"
        ContactItem(
            profileImageUrl = sampleImageUrl,
            name = "Joe Noe",
            isFavourite = false
        )
    }
}

