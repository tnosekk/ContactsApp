package pl.farmaprom.trainings.contactsapp.contacts.presentation.list

import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material.icons.outlined.Star
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import pl.farmaprom.trainings.contactsapp.R
import pl.farmaprom.trainings.contactsapp.ui.theme.ContactsAppTheme




@Composable
fun ContactItem(
    modifier: Modifier = Modifier,
    name: String,
    isFavorite: Boolean,
) {

    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(8.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            modifier = modifier.size(36.dp),
            painter = painterResource(R.drawable.face),
            contentDescription = null
        )
        Icon(
            imageVector = if (isFavorite) Icons.Filled.Star else Icons.Outlined.Star,
            contentDescription = null
        )

    }


}

@Preview(showBackground = true)
@Composable
private fun ContactItemPreview() {
    ContactsAppTheme {
        ContactItem(name = "Joe Doe", isFavorite = true)
    }
}
