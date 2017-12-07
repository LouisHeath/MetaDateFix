# MetaData Fix

When I restored my phone all of my backed up WhatsApp photos were returned to me with incorrect metadata. This was a pain when trying to put them on google photos, as they were all in the wrong order. There's no way I was going to manually tweak all 300 of them, so here's a simple solution.

If the true creation date can be found in the name of the image, say IMG-05122016, then this program can quickly fix them all. String splitting indexes will need changing for different name formats - a simple GUI is on my to-do list.

### Running

> cd metadata-fix
> python3 fix.py
