from collections import Counter

text = "Bufferbloat is a cause of high latency in packet-switched networks caused by excess buffering of packets. " \
       "Bufferbloat can also cause packet delay variation (also known as jitter), as well as reduce the overall " \
       "network throughput. When a router or switch is configured to use excessively large buffers, even very " \
       "high-speed networks can become practically unusable for many interactive applications like voice over IP (" \
       "VoIP), online gaming, and even ordinary web surfing. Some communications equipment manufacturers designed " \
       "unnecessarily large buffers into some of their network products. In such equipment, bufferbloat occurs when a " \
       "network link becomes congested, causing packets to become queued for long periods in these oversized buffers. " \
       "In a first-in first-out queuing system, overly large buffers result in longer queues and higher latency, " \
       "and do not improve network throughput. "

text_list = text.split()
# print(text_list)
count = Counter(text_list)
print(count.most_common(3))