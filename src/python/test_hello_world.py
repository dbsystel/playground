# Copyright 2019 DB Systel GmbH
# SPDX-License-Identifier: Apache-2.0

from hello_world import create_hello

def test_create_hello_world():
    assert create_hello() == "Hello, World!"
    assert create_hello("en") == "Hello, World!"
    assert create_hello("de") == "Hallo, Welt!"
    assert create_hello("tr") == "Merhaba, Dünya!"
    