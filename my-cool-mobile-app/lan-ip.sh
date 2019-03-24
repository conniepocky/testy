#!/bin/bash

echo "$(ip route get 1 | cut -d' ' -f7)" > .lan-ip
