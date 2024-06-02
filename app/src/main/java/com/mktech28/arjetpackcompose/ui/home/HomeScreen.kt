package com.mktech28.arjetpackcompose.ui.home

import android.widget.Toast
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PageSize
import androidx.compose.foundation.pager.PagerDefaults
import androidx.compose.foundation.pager.PagerScope
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.ScrollableTabRow
import androidx.compose.material3.Tab
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import com.mktech28.arjetpackcompose.ui.bed.BedScreen
import com.mktech28.arjetpackcompose.ui.chair.ChairScreen
import com.mktech28.arjetpackcompose.ui.cupboard.CupBaordScreen
import com.mktech28.arjetpackcompose.ui.sofa.SofaScreen
import com.mktech28.arjetpackcompose.ui.table.TableScreen
import kotlinx.coroutines.launch

@Composable
fun HomeScreen() {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        SearchBar()
        Spacer(modifier = Modifier.height(16.dp))
        HorizontalViewPager()
    }
}

@Composable
fun SearchBar() {
    val context = LocalContext.current
    var searchQuery by remember { mutableStateOf(TextFieldValue("")) }

    TextField(
        value = searchQuery,
        onValueChange = { newValue -> searchQuery = newValue },
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .padding(16.dp)
            .shadow(8.dp, RoundedCornerShape(8.dp)),
        placeholder = { Text(text = "Search Product") },
        trailingIcon = {
            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = "Search Icon",
                modifier = Modifier
                    .clickable {
                        if (searchQuery.text.isEmpty()) {
                            Toast
                                .makeText(
                                    context,
                                    "Please enter a search query",
                                    Toast.LENGTH_SHORT
                                )
                                .show()
                        }
                    }
                    .padding(end = 8.dp)
            )
        },
        shape = RoundedCornerShape(8.dp),
        singleLine = true
    )

}

//@OptIn(ExperimentalFoundationApi::class)
//@Composable
//fun HorizontalViewPager() {
//    val items = listOf("Home", "Chair", "Cupboard", "Table", "Sofa", "Bed")
//    val pagerState = rememberPagerState(
//        initialPage = 0,
//        initialPageOffsetFraction = 0f
//    ) {
//        items.size
//    }
//    val coroutineScope = rememberCoroutineScope()
//
//    Column {
//        ScrollableTabRow(
//            selectedTabIndex = pagerState.currentPage,
//            modifier = Modifier.fillMaxWidth()
//        ) {
//            items.forEachIndexed { index, title ->
//                Tab(
//                    selected = pagerState.currentPage == index,
//                    onClick = {
//                        coroutineScope.launch {
//                            pagerState.scrollToPage(index)
//                        }
//                    },
//                    text = { Text(text = title) }
//                )
//            }
//        }
//        HorizontalPager(
//            state = pagerState,
//            modifier = Modifier.fillMaxSize()
//        ) { page ->
//            when (items[page]) {
//                "Home" -> HomeScreen()
//                "Chair" -> ChairScreen()
//                "Cupboard" -> CupBaordScreen()
//                "Table" -> TableScreen()
//                "Sofa" -> SofaScreen()
//                "Bed" -> BedScreen()
//            }
//        }
//    }
//}


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HorizontalViewPager() {
    val items = listOf("Home", "Chair", "Cupboard", "Table", "Sofa", "Bed")
    // Display 10 items
    val pagerState = rememberPagerState(pageCount = {
        items.size
    })

    val coroutineScope = rememberCoroutineScope()

    ScrollableTabRow(
        selectedTabIndex = pagerState.currentPage,
        modifier = Modifier.fillMaxWidth()
    ) {
        items.forEachIndexed { index, title ->
            Tab(
                selected = pagerState.currentPage == index,
                onClick = {
                    coroutineScope.launch {
                        pagerState.scrollToPage(index)
                    }
                },
                text = { Text(text = title) }
            )
        }
    }
    HorizontalPager(
        state = pagerState,
        modifier = Modifier.fillMaxSize()
    ) { page ->
        when (items[page]) {
            "Chair" -> ChairScreen()
            "Cupboard" -> CupBaordScreen()
            "Table" -> TableScreen()
            "Sofa" -> SofaScreen()
            "Bed" -> BedScreen()
        }
    }


}

//@Preview
//@Composable
//fun Home() {
//    HomeScreen()
//}