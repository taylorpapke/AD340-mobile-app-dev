/*
 * Copyright (C) 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.affirmations.data

import com.example.affirmations.R
import com.example.affirmations.model.affirmations

/**
 * [Datasource] generates a list of [Affirmation]
 */
class Datasource() {
    fun loadAffirmations(): List<affirmations> {
        return listOf<affirmations>(
            affirmations(R.string.affirmation1, R.drawable.batman_infobox),
            affirmations(R.string.affirmation2, R.drawable.catwoman_cosplay_main_pj82teyas07f5s10d954w53rxyasltbizey1zydlq0),
            affirmations(R.string.affirmation3, R.drawable.peter_parker__28earth_616_29_017),
            affirmations(R.string.affirmation4, R.drawable.keke_palmer_storm_900x900),
            affirmations(R.string.affirmation5, R.drawable.supermanflying),
            affirmations(R.string.affirmation6, R.drawable.wonderwoman2_0),
            affirmations(R.string.affirmation7, R.drawable.captain_america__steve_rogers_),
            affirmations(R.string.affirmation8, R.drawable._wmcd4wg34u81_jpg),
        )
    }
}
