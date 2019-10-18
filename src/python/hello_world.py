#!/usr/bin/env python3
# Copyright 2019 DB Systel GmbH
# SPDX-License-Identifier: Apache-2.0

import sys

def create_hello(language="en"):
    hellos = {
      "en": "Hello, World!",
      "de": "Hallo, Welt!",
      "tr": "Merhaba, Dünya!",
    }
    return hellos[language]

language = "en"
if len(sys.argv) >= 2:
    language = sys.argv[1]

print(create_hello(language))
