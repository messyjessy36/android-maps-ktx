/*
 * Copyright 2020 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.google.maps.android.ktx.model

import com.google.android.gms.maps.model.CameraPosition

/**
 * Builds a new [CameraPosition] using the provided [optionsActions]. Using this removes the need
 * to construct a [CameraPosition.Builder] object.
 *
 * @return the constructed [CameraPosition]
 */
public inline fun cameraPosition(optionsActions: CameraPosition.Builder.() -> Unit): CameraPosition =
    CameraPosition.Builder().apply(optionsActions).build()
