# defiance-server
An Open Source Kotlin implementation of the Defiance 2013 propriatary server software.

### For contributors

#### Getting Started

If you would like to contribute to the development of the server, you can download the [prototype build](https://drive.google.com/file/d/1LFCSar1wpMmgtSxjz1r9gfCvDCmh_GQO/view?usp=sharing) for Xbox 360, which contains its function MAP(pings) file, and PDB file. 

(Please note: there will a few changes between the protocol in the xbox version and PC version)

To load the XeX in IDA, please use the [idaxex](https://github.com/emoose/idaxex/releases/tag/0.30) plugin, and change the `PDB_PROVIDER` option in `pdb.cfg` to MSDIA, as IDA’s default provider seems to be incomplete and has limited support when loading the PDB. When prompted with the base address, use `0x82000000` as per idaxex’s default recommendation, and also uncheck the types only option, if you wish to recover function parameter types (even though DIA supports loading locals, IDA doesn’t seem to care).

#### Mapping Messages

`Ch2ClientGameMgr` contains the message handling definitions, it would be helpful if we left a small comment above each message type declared in `Ch2NetDefs` with the corresponding behaviour once the message is handled, along with their fields, in the order they are serialised.
