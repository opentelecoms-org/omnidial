
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
