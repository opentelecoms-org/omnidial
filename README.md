
# Introduction

Omnidial is a project aiming to improve real-time discovery of mechanisms
for routing a call or message through the Internet.


* Available as an Android app and a Java library for integration in other
  Android and desktop applications.
* Takes a phone number or address book data as input.
* Using the phone numbers (and possibly the email addresses from an address
  book entry, if present), tries to identify any of the following:
** Conversion of the phone number(s) to E.164 format.
** ENUM to SIP mappings for any of the contact phone numbers.
** ENUM to XMPP mappings for any of the contact phone numbers.
** Use of public or private ENUM trees, ENUM stacking.
** Checking the email addresses for SIP capability (using NAPTR/SRV lookups
   on the domain and various other mechanisms)
** Checking the email addresses for XMPP capability (using NAPTR/SRV lookups
   on the domain and various other mechanisms)
* Based on the dialer in the [Lumicall](https://lumicall.org) app

Omnidial can also be used to scan and improve contact data in bulk (in a
batch operation) or on an individual, case by case basis.

# Copyright and license

Copyright (C) 2012-2016 Daniel Pocock https://danielpocock.com

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program.  If not, see <http://www.gnu.org/licenses/>.
